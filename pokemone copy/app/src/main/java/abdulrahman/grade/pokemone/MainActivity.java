package abdulrahman.grade.pokemone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<pokemone> mypokemones = new ArrayList<>();

        pokemone p1 = new pokemone ("bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemone p2 = new pokemone ("charizard",R.drawable.charizard,84,78,534);
        pokemone p3 = new pokemone ("pikachu",R.drawable.pikachu,55,40,320);

        mypokemones.add(p1);
        mypokemones.add(p2);
        mypokemones.add(p3);

        RecyclerView jk = findViewById(R.id.hello);




    }
}