package com.malditasorte.java.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.malditasorte.java.adapter.HistoricoAdapter;
import com.malditasorte.java.model.Jogo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 0118431 on 29/06/2016.
 */
public class HistoricoJogo extends Activity{

    private ListView lvHistorico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historico_jogo);

        lvHistorico = (ListView) findViewById(R.id.lvHistorico);

        List<Jogo> listaJogo = new ArrayList<>();

        listaJogo.add(new Jogo(1,"Filipe é gostoso","01 - 02 - 03 - 04 - 05 \n" +
                                                    "06 - 07 - 08 - 09 - 10 \n" +
                                                    "11 - 12 - 13 - 14 - 15 ",new Date(),new BigDecimal(1)));

        listaJogo.add(new Jogo(1,"Filipe é gostoso","01 - 02 - 03 - 04 - 05 \n" +
                "06 - 07 - 08 - 09 - 10 \n" +
                "11 - 12 - 13 - 14 - 15 ",new Date(),new BigDecimal(1)));

        listaJogo.add(new Jogo(1,"Filipe é gostoso","01 - 02 - 03 - 04 - 05 \n" +
                "06 - 07 - 08 - 09 - 10 \n" +
                "11 - 12 - 13 - 14 - 15 ",new Date(),new BigDecimal(1)));

        listaJogo.add(new Jogo(1,"Filipe é gostoso","01 - 02 - 03 - 04 - 05 \n" +
                "06 - 07 - 08 - 09 - 10 \n" +
                "11 - 12 - 13 - 14 - 15 ",new Date(),new BigDecimal(1)));

        listaJogo.add(new Jogo(1,"Filipe é gostoso","01 - 02 - 03 - 04 - 05 \n" +
                "06 - 07 - 08 - 09 - 10 \n" +
                "11 - 12 - 13 - 14 - 15 ",new Date(),new BigDecimal(1)));

        HistoricoAdapter historicoAdapter = new HistoricoAdapter(this,R.layout.list_adapter_historico,listaJogo);

        lvHistorico.setAdapter(historicoAdapter);

    }
}
