package suporte;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GerarDataHora {
    public static String geradorDeDataHora(){
        Date data = new Date();
        String data_e_hora_atual = new SimpleDateFormat("d-M-Y K-m").format(data);
        return data_e_hora_atual;
    }
}
