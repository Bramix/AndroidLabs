package sumdu.edu.lifecycle_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void onClick(View view)
    {
        Intent intent = new Intent (this, MainActivity.class);
        intent.addFlags (Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity (intent);
    }

}