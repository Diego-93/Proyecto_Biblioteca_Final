package chile.maps.biblioteca;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GitHub_act extends AppCompatActivity {

    private GitHub_act View;
    private GitHub_act v;

    public GitHub_act(GitHub_act view, GitHub_act v) {
        View = view;
        this.v = v;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_git_hub_act);


        public void  Ver1(View v)
        {
            Toast Ver1 = Toast.makeText((getApplicationContext()),"Verificacion", Toast.LENGTH_SHORT);
            Ver1.setGravity(Gravity.CENTER,0,0);
        }

    }

}

