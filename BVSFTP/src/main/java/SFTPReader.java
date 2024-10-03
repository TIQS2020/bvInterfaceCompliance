import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import java.util.Properties;
import java.util.Vector;

public class SFTPReader {

    private String host;
    private int port;
    private String username;
    private String privateKeyPath;

    public SFTPReader(String host, int port, String username, String privateKeyPath) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.privateKeyPath = privateKeyPath;
    }

    public void listFiles(String remoteDirectory) {
        Session session = null;
        ChannelSftp channelSftp = null;

        try {
            JSch jsch = new JSch();

            // Carregar a chave privada PPK
            jsch.addIdentity(privateKeyPath);
            jsch.setKnownHosts("C:/Java/resources/known_hosts");

            // Criar sessão com username, host e porta
            session = jsch.getSession(username, host, port);

            // Configurar propriedades da sessão
            Properties config = new Properties();
           //config.put("StrictHostKeyChecking", "no"); // Desabilita verificação de host key para desenvolvimento
            config.put("UserAuthPublicKey", "yes");
            session.setConfig(config);

            // Conectar a sessão
            session.connect();

            // Abrir canal SFTP
            channelSftp = (ChannelSftp) session.openChannel("sftp");
            channelSftp.connect();

            // Listar arquivos e diretórios
            System.out.println("Listando arquivos do diretório: " + remoteDirectory);
            Vector<ChannelSftp.LsEntry> fileList = channelSftp.ls(remoteDirectory);

            for (ChannelSftp.LsEntry entry : fileList) {
                if (entry.getAttrs().isDir()) {
                    System.out.println("[DIR] " + entry.getFilename());
                } else {
                    System.out.println("[FILE] " + entry.getFilename());
                }
            }

        } catch (SftpException e) {
            System.err.println("Erro ao acessar o diretório remoto: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o canal e a sessão
            if (channelSftp != null) {
                channelSftp.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
    }

    public static void main(String[] args) {
        // Informações de conexão SFTP
        String host = "sftp.autovis.com.br"; // Host
        int port = 22;  // Porta padrão para SFTP (SSH)
        String username = "integracao-hml";  // Username
        String privateKeyPath = "C:/Java/resources/key.pem";  // Caminho para o arquivo PPK
        String remoteDirectory = "/recebido";  // Diretório remoto no servidor

        // Instanciar SFTPReader e listar arquivos no diretório remoto
        SFTPReader sftpReader = new SFTPReader(host, port, username, privateKeyPath);
        sftpReader.listFiles(remoteDirectory);
    }
}
