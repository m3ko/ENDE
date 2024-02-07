package logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Esta clase proporciona un formato HTML personalizado para los registros del logger.
 * Genera un archivo HTML con los resultados de las operaciones de la calculadora.
 * 
 *@author [Niko Efrem]
 * @version [07/02/2024]
 */
public class HTMLFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder html = new StringBuilder();

        if (record.getSequenceNumber() == 0) {
            html.append("<html>\n<head>\n<link rel=\"stylesheet\" href=\"style.css\">\n</head>\n<body>\n<table>\n");
            html.append("<tr>\n<th>Operación</th>\n<th>Operando 1</th>\n<th>Operando 2</th>\n<th>Resultado</th>\n</tr>\n");
        }

        html.append("<tr>\n");
        html.append("<td>").append(record.getMessage()).append("</td>\n");
        html.append("<td>").append(record.getParameters()[0]).append("</td>\n");
        html.append("<td>").append(record.getParameters()[1]).append("</td>\n");
        html.append("<td>").append(record.getParameters()[2]).append("</td>\n");
        html.append("</tr>\n");

        if (record.getSequenceNumber() == record.getMillis() - 1) {
            html.append("</table>\n</body>\n</html>\n");
        }

        return html.toString();
    }
}