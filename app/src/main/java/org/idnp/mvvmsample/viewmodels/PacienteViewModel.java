package org.idnp.mvvmsample.viewmodels;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import org.idnp.mvvmsample.BR;
import org.idnp.mvvmsample.SecondActivity;
import org.idnp.mvvmsample.model.Paciente;

public class PacienteViewModel extends BaseObservable {

    private Paciente paciente;
    private String successMessage = "Paciente guardado";
    private String errorMessage = "No se pudo guardar el paciente, revise los datos";
    private Context context;

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
    public String getUserNombres() {
        return paciente.getNombres();
    }

    @Bindable
    public String getUserApellidos() {
        return paciente.getApellidos();
    }

    @Bindable
    public String getUserDni() {
        return paciente.getDni();
    }

    @Bindable
    public String getUserDireccion() {
        return paciente.getDireccion();
    }

    public void setUserNombres(String nombres) {
        //Log.d("AAA", email);
        paciente.setNombres(nombres);
        notifyPropertyChanged(BR.userNombres);
    }

    public void setUserApellidos(String apellidos) {
        paciente.setApellidos(apellidos);
        notifyPropertyChanged(BR.userApellidos);
    }
    public void setUserDni(String dni) {
        paciente.setDni(dni);
        notifyPropertyChanged(BR.userDni);
    }
    public void setUserDireccion(String direccion) {
        paciente.setDireccion(direccion);
        notifyPropertyChanged(BR.userDireccion);
    }

    public PacienteViewModel(Context context) {
        paciente = new Paciente();
        this.context = context;
    }

    public void onGuardarClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        if(TextUtils.isEmpty(getUserNombres()) || TextUtils.isEmpty(getUserApellidos()) || TextUtils.isEmpty(getUserDni()) || TextUtils.isEmpty(getUserDireccion())){
            return false;
        }
        else{
            return true;
        }

    }

    public void onSecondActivity() {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }

}
