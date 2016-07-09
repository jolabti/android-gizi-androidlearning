package com.example.lutfi.menuprogram;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.StringWriter;

public class Kalkulator extends Activity {
   //EditText  edtb,edtNAMA;
  EditText edNama,edTinggiBadan,edBeratBadan;
  Button clickthis;
  TextView tvCetak;
  int a,b,hasil;
  String aString,bString;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_kalkulator);
      final String am;
      edNama=(EditText)findViewById(R.id.idednama);
      edTinggiBadan=(EditText)findViewById(R.id.idedtinggibadan);
      edBeratBadan=(EditText)findViewById(R.id.idedberatbadan);

      clickthis=(Button)findViewById(R.id.btnresult);

      tvCetak=(TextView)findViewById(R.id.tvhasil);

      //a=Integer.parseInt(edTinggiBadan.getText().toString());

      aString=edTinggiBadan.getText().toString();
      bString=edTinggiBadan.getText().toString();

       a= Integer.parseInt(aString);
        b= Integer.parseInt(bString);

      hasil = a + b;


      clickthis.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              tvCetak.setText(edNama.getText().toString()  + String.valueOf(hasil));

          }
      });



  }

}



/*
*
//
//        ambilUmur = Integer.parseInt(ed_umur.getText().toString());
//        ambilberat_badan = Integer.parseInt(ed_bb.getText().toString());
//        ambiltinggi_badan = Integer.parseInt(ed_tb.getText().toString());
//
//
//        //mengambil data nilai aktifitas
//        nilAktf = sp_akt.getSelectedItem().toString();
//
//        // mengambil data jenis kelamin
//
//
//        tampungJekel = sp_jekel.getSelectedItem().toString();


        /*Harus cek jika nilai aktif ringan, sedang , atau berat
        * Jika data yang diambil pria ringan maka ..... , jika sedang maka .., jika berat maka.....
        *
        * */

//ringan dan laki2
//        if (nilAktf == arrayspinner[0] && tampungJekel == jekel[0]) {
//
//            hasilNaktif = laki2[0];
//
//        }
//        //sedang dan laki2
//        else if (nilAktf = arrayspinner[1] && tampungJekel == jekel[0]){
//
//            hasilNaktif = laki2[1];
//        }
//        //berat dan laki2
//        else if (nilAktf = arrayspinner[2] && tampungJekel == jekel[0]) {
//
//            hasilNaktif = laki2[2];
//
//        }
//        //ringan dan wanita
//        else if (nilAktf = arrayspinner[0] && tampungJekel ==[1])
//            {
//                hasilNaktif = cewe2[0];
//            }
//            //sedang dan wanita
//            else if (nilAktf = arrayspinner[1] && tampungJekel ==[1]){
//
//                hasilNaktif = cewe2[1];
//            }
//            //berat dan wanita
//            else if (nilAktf = arrayspinner[2] && tampungJekel ==[1]){
//
//                hasilNaktif = cewe2[2];
//            }
//
//            hitungIMT = ambilberat_badan / ((ambiltinggi_badan /100) * (ambiltinggi_badan/100));
//
//            //hitung AMB Pria
//            if (tampungJekel==jekel[0])
//            {
//
//                hitungAMB= 66.5+(13.7*ambilberat_badan)+(5.0*ambiltinggi_badan)-(6.8*ambilUmur);
//            //hitung AMB wanita
//            }else if(tampungJekel==jekel[1])
//            {
//                hitungAMB= 655+(9.6*ambilberat_badan)+(1.8*ambiltinggi_badan)-(4.7*ambilUmur);
//
//            }
//
//            hitungKalori= hasilNaktif * hitungAMB;
//
