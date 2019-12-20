package com.app.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

import chile.maps.biblioteca.R;

public class Mqtt_act extends AppCompatActivity {
    static String MQTTHOST="tcp:/tailor.cloudmqtt.com:14050";
    static String USERNAME ="dcarreno";
    static String PASSWORD="GHW1LDR_2019";
    String topicStr="mensaje";
    MqttAndroidClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt_act);

        String clientId = MqttClient.generateClientId();
        client = new MqttAndroidClient(this.getApplicationContext(),MQTTHOST,clientId);
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(USERNAME);
        options.setPassword(PASSWORD.toCharArray());


        try {
            IMqttToken token = client.connect(options);
            token.setActionCallback(new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {

                    Toast.makeText(getBaseContext(), "exito al conectar", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                    Toast.makeText(getBaseContext(), " error al conectar ", Toast.LENGTH_SHORT).show();

                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }

    }

    public void m1(View v){
        String topic = topicStr;
        String mensaje = "El Principito";
        try{
            client.publish(topic,mensaje.getBytes(),0,false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void m2(View v){
        String topic = topicStr;
        String mensaje = "Game Of Thrones";
        try{
            client.publish(topic,mensaje.getBytes(),0,false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void m3(View v){
        String topic = topicStr;
        String mensaje = "El Diablo III";
        try{
            client.publish(topic,mensaje.getBytes(),0,false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void m4(View v){
        String topic = topicStr;
        String mensaje = "Donde Esta Constanza";
        try{
            client.publish(topic,mensaje.getBytes(),0,false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void m5(View v){
        String topic = topicStr;
        String mensaje = "La Guerra del pacifico";
        try{
            client.publish(topic,mensaje.getBytes(),0,false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
