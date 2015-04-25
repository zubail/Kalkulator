package id.ac.unsyiah.jte.mobile.calc1;

import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up btn_terjemah, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onClickBtnAcak(View view) {
        EditText txtangka1 = (EditText) findViewById(R.id.txtAngka1);
        String angka1Str = String.valueOf(txtangka1.getText());
        int angka1 = Integer.valueOf(angka1Str);

        EditText txtangka2 = (EditText) findViewById(R.id.txtAngka2);
        String angka2Str = String.valueOf(txtangka2.getText());
        int angka2 = Integer.valueOf(angka2Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.tambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.kurang);
        RadioButton kali = (RadioButton) findViewById(R.id.kali);
        RadioButton bagi = (RadioButton) findViewById(R.id.bagi);

        int hasil = 0;

        if (tambah.isChecked()){
            hasil = angka1 + angka2;
        }
        else if (kurang.isChecked()){
            hasil = angka1 - angka2;
        }
        else if(kali.isChecked()){
            hasil = angka1 * angka2;
        }
        else if(bagi.isChecked()) {
            hasil = angka1 / angka2;
        }
        TextView lblhasil = (TextView) findViewById(R.id.lblHasil);
        lblhasil.setText(String.valueOf(hasil));
    }
}