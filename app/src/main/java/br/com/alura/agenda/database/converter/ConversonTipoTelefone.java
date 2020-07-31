package br.com.alura.agenda.database.converter;

import android.arch.persistence.room.TypeConverter;

import br.com.alura.agenda.model.TipoTelefone;

public class ConversonTipoTelefone {

    @TypeConverter
    public String paraString(TipoTelefone tipo){
        return tipo.name();
    }

    @TypeConverter
    public  TipoTelefone paraTipoTelefone(String valor){
        if (valor != null){
            return TipoTelefone.valueOf(valor);
        }
        return TipoTelefone.FIXO;
    }
}
