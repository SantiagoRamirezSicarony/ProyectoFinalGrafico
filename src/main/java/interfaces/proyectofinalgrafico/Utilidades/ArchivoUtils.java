package interfaces.proyectofinalgrafico.Utilidades;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ArchivoUtils {
    /**
     * Convierte una imagen BufferedImage a un array de bytes.
     *
     * @param imagen La imagen a convertir.
     * @param formato El formato de la imagen (por ejemplo, "jpg" o "png").
     * @return Un array de bytes que representa la imagen.
     * @throws IOException Si ocurre un error al convertir la imagen.
     */
    public static byte[] convertirImagenABytes(BufferedImage imagen, String formato) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(imagen, formato, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Convierte un array de bytes en una imagen BufferedImage.
     *
     * @param bytesImagen El array de bytes que representa la imagen.
     * @return Un BufferedImage que representa la imagen.
     * @throws IOException Si ocurre un error al leer la imagen.
     */
    public static BufferedImage convertirBytesAImagen(byte[] bytesImagen) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytesImagen);
        return ImageIO.read(byteArrayInputStream);
    }

    public Image obtenerImagen(){
        Image image = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar imagen");

        // Filtro para mostrar solo archivos de imagen
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Archivos de imagen", "*.png", "*.jpg", "*.jpeg");
        fileChooser.getExtensionFilters().add(imageFilter);

        // Mostrar el diálogo de selección de archivo
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            // Crear una imagen a partir del archivo seleccionado
            image = new Image(selectedFile.toURI().toString());
        }
        return image;
    }
    public static BufferedImage convertirImageABufferedImage(Image image) {
        int width = (int) image.getWidth();
        int height = (int) image.getHeight();
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        WritableImage writableImage = new WritableImage(width, height);
        PixelReader pixelReader = image.getPixelReader();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                bufferedImage.setRGB(x, y, pixelReader.getArgb(x, y));
            }
        }
        return bufferedImage;
    }

    public static Image convertirBufferedImageAImage(BufferedImage bufferedImage) {
        WritableImage writableImage = new WritableImage(bufferedImage.getWidth(), bufferedImage.getHeight());
        PixelWriter pixelWriter = writableImage.getPixelWriter();
        for (int y = 0; y < bufferedImage.getHeight(); y++) {
            for (int x = 0; x < bufferedImage.getWidth(); x++) {
                pixelWriter.setArgb(x, y, bufferedImage.getRGB(x, y));
            }
        }
        return writableImage;
    }
}
