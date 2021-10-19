package org.idnp.mvvmsample.viewmodels;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.idnp.mvvmsample.BR;
import org.idnp.mvvmsample.MainActivity;
import org.idnp.mvvmsample.SecondActivity;
import org.idnp.mvvmsample.model.Paciente;
import org.idnp.mvvmsample.model.Visita;

import java.util.ArrayList;
import java.util.List;

public class VisitaViewModel extends BaseObservable {
    private Visita visita;
    private Context context;
    private String successMessage = "Visita guardada";
    private String errorMessage = "No se pudo guardar la visita, revise los datos";

    @Bindable
    private String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getVisitaTemperatura() {
        return visita.getTemperatura();
    }

    @Bindable
    public String getVisitaPresion() {
        return visita.getPresion();
    }

    @Bindable
    public String getVisitaPeso() {
        return visita.getPeso();
    }

    @Bindable
    public String getVisitaSaturacion() {
        return visita.getSaturacion();
    }

    public void setVisitaTemperatura(String temperatura) {
        visita.setTemperatura(temperatura);
        notifyPropertyChanged(BR.visitaTemperatura);
    }

    public void setVisitaPresion(String presion) {
        visita.setPresion(presion);
        notifyPropertyChanged(BR.visitaPresion);
    }
    public void setVisitaPeso(String peso) {
        visita.setPeso(peso);
        notifyPropertyChanged(BR.visitaPeso);
    }
    public void setVisitaSaturacion(String saturacion) {
        visita.setSaturacion(saturacion);
        notifyPropertyChanged(BR.visitaSaturacion);
    }

    public VisitaViewModel(Context context) {
        visita = new Visita();
        this.context = context;
    }

    public void onRegistrarClicked() {
        if (isInputDataValid()) {
            setToastMessage(successMessage);
            onMainActivity();
        }
        else {
            setToastMessage(errorMessage);
        }
    }

    public boolean isInputDataValid() {
        if(TextUtils.isEmpty(getVisitaTemperatura()) || TextUtils.isEmpty(getVisitaPresion()) || TextUtils.isEmpty(getVisitaPeso()) || TextUtils.isEmpty(getVisitaSaturacion())){
            return false;
        }
        else{
            return true;
        }
    }

    public void onMainActivity() {
        //Regresar a main activity
    }
}
