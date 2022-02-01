import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import net.glxn.qrgen.image.ImageType;
import net.glxn.qrgen.QRCode;

public class myqrcode
{
    public static void main(final String[] args) throws Exception {
        final String me = "@author ayush aggarwal";
        final ByteArrayOutputStream out = QRCode.from(me).to(ImageType.PNG).stream();
        final File f = new File("D:\\NCU\\my.png");
        final FileOutputStream fs = new FileOutputStream(f);
        fs.write(out.toByteArray());
        fs.flush();
        System.out.println("QR CODE GENERATED");
        fs.close();
    }
}