package com.example.itadmin.bordesredondoslistview.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.itadmin.bordesredondoslistview.R;
import com.example.itadmin.bordesredondoslistview.model.Option;

import java.util.ArrayList;

/**
 * Created by itadmin on 12/26/15.
 */
public class OptionAdapter extends ArrayAdapter<Option>
{
    private Context context;
    private ArrayList<Option> Datos;

    public OptionAdapter(Context pContext,ArrayList <Option> pData)
    {
        super(pContext, R.layout.option_item, pData);
        context = pContext;
        Datos = pData;
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parents)
    {
        Holder holder;
        View item = convertView;

        if(item == null)
        {
            item = LayoutInflater.from(context).inflate(R.layout.option_item,
                    null);

            holder = new Holder();
            holder.imgLogo = (ImageView) item.findViewById(R.id.imgOption);
            holder.txtvTitle = (TextView) item.findViewById(R.id.txtvTitleOption);

            item.setTag(holder);
        }
        else
        {
            holder = (Holder) item.getTag();

        }

        holder.imgLogo.setImageResource( Datos.get(position).image);
        holder.txtvTitle.setText(Datos.get(position).title);

        return item;
    }

    class Holder
    {
        public ImageView imgLogo;
        public TextView txtvTitle;
    }
}
