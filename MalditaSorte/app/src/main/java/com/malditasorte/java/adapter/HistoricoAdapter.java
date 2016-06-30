package com.malditasorte.java.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.malditasorte.java.activity.R;
import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.util.MetodosBasicos;

import java.util.List;

/**
 * Created by Filipe on 29/06/2016.
 */
public class HistoricoAdapter extends ArrayAdapter<Jogo> {

    private Context mContext;
    private int mResource;

    public HistoricoAdapter(Context context, int resource, List<Jogo> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mResource, parent, false);
        }

        TextView txtJogo        = (TextView) convertView.findViewById(R.id.txtJogo);
        TextView txtData        = (TextView) convertView.findViewById(R.id.txtData);
        TextView txtAcerto      = (TextView) convertView.findViewById(R.id.txtAcerto);

        txtJogo.setText(getItem(position).getNumJogo());
        txtData.setText(MetodosBasicos.DateToString(getItem(position).getDatJogo()));
        txtAcerto.setText("");


        return convertView;
    }
}
