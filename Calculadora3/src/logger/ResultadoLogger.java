package logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase registra manualmente algunos resultados de operaciones de la calculadora.
 * Los resultados se almacenan en un archivo de log en formato HTML.
 * 
 * @author [Niko Efrem]
 * @version [07/02/2024]
 */
public class ResultadoLogger {
    public static final Logger LOGGER = Logger.getLogger("ResultadoLogger");

    public static void main(String[] args) {
        Handler consoleHandler = new ConsoleHandler();
        Handler fileHandler = null;
        LOGGER.addHandler(consoleHandler);

        LOGGER.setLevel(Level.ALL);
        LOGGER.setUseParentHandlers(false);

        try {
            fileHandler = new FileHandler("./logs/resultadosCalculadora.html", true);
            fileHandler.setFormatter(new HTMLFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        LOGGER.log(Level.INFO, "+", new Object[] { 5, 3, 8 });
        LOGGER.log(Level.INFO, "-", new Object[] { 10, 5, 5 });

        for (Handler handler : LOGGER.getHandlers()) {
            handler.close();
        }
    }
}