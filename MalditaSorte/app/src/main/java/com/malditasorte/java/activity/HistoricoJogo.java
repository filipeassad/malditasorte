package com.malditasorte.java.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.malditasorte.java.adapter.HistoricoAdapter;
import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.util.VariaveisEstaticas;

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

        HistoricoAdapter historicoAdapter = new HistoricoAdapter(this,R.layout.list_adapter_historico, VariaveisEstaticas.getJogos());

        lvHistorico.setAdapter(historicoAdapter);

    }
}
