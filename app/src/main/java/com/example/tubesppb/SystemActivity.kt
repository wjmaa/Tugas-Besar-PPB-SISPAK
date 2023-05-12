package com.example.tubesppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.example.tubesppb.databinding.ActivitySystemBinding
import org.w3c.dom.Text

class SystemActivity : AppCompatActivity() {
    lateinit var binding: ActivitySystemBinding

    private lateinit var perutKembung : CheckBox
    private lateinit var nyeriLambung : CheckBox
    private lateinit var nafsuMakan : CheckBox
    private lateinit var mual : CheckBox
    private lateinit var sembelit : CheckBox
    private lateinit var diare : CheckBox
    private lateinit var bbMenurun : CheckBox
    private lateinit var babHitam : CheckBox
    private lateinit var demam : CheckBox
    private lateinit var rasaMakanKembali : CheckBox
    private lateinit var babCair : CheckBox
    private lateinit var kejangPerut : CheckBox
    private lateinit var nyeriUluhHati : CheckBox
    private lateinit var kenyangBerlebih : CheckBox
    private lateinit var nyeriTukakLambung : CheckBox
    private lateinit var muntah : CheckBox
    private lateinit var rasaTerbakar : CheckBox
    private lateinit var btnDiagnosa : Button
    private lateinit var resultDiagnosa : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySystemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        perutKembung = findViewById<CheckBox>(R.id.perutKembung)
        nyeriLambung = findViewById<CheckBox>(R.id.nyeriLambung)
        nafsuMakan = findViewById<CheckBox>(R.id.nafsuMakan)
        mual = findViewById<CheckBox>(R.id.mual)
        sembelit = findViewById<CheckBox>(R.id.sembelit)
        diare = findViewById<CheckBox>(R.id.diare)
        bbMenurun = findViewById<CheckBox>(R.id.BBMenurun)
        babHitam = findViewById<CheckBox>(R.id.BABhitam)
        demam = findViewById<CheckBox>(R.id.demam)
        rasaMakanKembali = findViewById<CheckBox>(R.id.rasaMakanKembali)
        babCair = findViewById<CheckBox>(R.id.babCair)
        kejangPerut = findViewById<CheckBox>(R.id.kejangPerut)
        nyeriUluhHati = findViewById<CheckBox>(R.id.nyeriUluhHati)
        kenyangBerlebih = findViewById<CheckBox>(R.id.kenyangBerlebih)
        nyeriTukakLambung = findViewById<CheckBox>(R.id.nyeriTukakLambung)
        muntah = findViewById<CheckBox>(R.id.muntah)
        rasaTerbakar = findViewById<CheckBox>(R.id.rasaTerbakar)

        btnDiagnosa = findViewById<Button>(R.id.btnDiagnosa)
        resultDiagnosa = findViewById<TextView>(R.id.resultDiagnosa)

        btnDiagnosa.setOnClickListener{
            var namaPenyakit = ""

            // Memeriksa status checkbox dan menggabungkan nama penyakit yang sesuai dengan rule
            if (nyeriLambung.isChecked && perutKembung.isChecked
                && nafsuMakan.isChecked && mual.isChecked
                && nyeriUluhHati.isChecked) {
                namaPenyakit += "Gastritis"
            }
            if (nyeriLambung.isChecked && perutKembung.isChecked
                && mual.isChecked && sembelit.isChecked
                && diare.isChecked && kenyangBerlebih.isChecked) {
                namaPenyakit += "Dispepsia"
            }
            if (nafsuMakan.isChecked && mual.isChecked
                && bbMenurun.isChecked && babHitam.isChecked
                && kejangPerut.isChecked) {
                namaPenyakit += "Kanker Lambung"
            }
            if (nyeriLambung.isChecked && perutKembung.isChecked
                && mual.isChecked && demam.isChecked
                && rasaMakanKembali.isChecked && kejangPerut.isChecked
                && rasaTerbakar.isChecked) {
                namaPenyakit += "GERD"
            }
            if (nyeriLambung.isChecked && mual.isChecked
                && diare.isChecked && demam.isChecked
                && rasaMakanKembali.isChecked && kejangPerut.isChecked
                && muntah.isChecked) {
                namaPenyakit += "Gastroenteritis"
            }
            if (perutKembung.isChecked && nafsuMakan.isChecked
                && bbMenurun.isChecked && rasaMakanKembali.isChecked
                && kejangPerut.isChecked && kenyangBerlebih.isChecked) {
                namaPenyakit += "Gastroparesis"
            }
            if (nyeriLambung.isChecked && nafsuMakan.isChecked
                && mual.isChecked && babHitam.isChecked
                && nyeriTukakLambung.isChecked) {
                namaPenyakit += "Tukak Lambung"
            }

            // Menampilkan hasil diagnosis di TextView resultDiagnosa
            resultDiagnosa.text = "Anda didiagnosis dengan: $namaPenyakit"

        }
    }

    fun onClickChecked(view: View?){
        val checked = (view as CheckBox).isChecked
        var str = ""
        when (view.id) {
            R.id.nyeriLambung -> {str = if (checked) "Gejala Nyeri atau Perih Pada Lambung Diseleksi" else "Gejala Nyeri atau Perih Pada Lambung Tidak Diseleksi"}
            R.id.perutKembung -> {str = if (checked) "Gejala Perut Kembung Diseleksi" else "Gejala Perut Kembung Tidak Diseleksi"}
            R.id.nafsuMakan -> {str = if (checked) "Gejala Nafsu Makan Berkurang Diseleksi" else "Gejala Nafsu Makan Berkurang Tidak Diseleksi"}
            R.id.mual -> {str = if (checked) "Gejala Mual Diseleksi" else "Gejala Mual Tidak Diseleksi"}
            R.id.sembelit -> {str = if (checked) "Gejala Sembelit Diseleksi" else "Gejala Sembelit Tidak Diseleksi"}
            R.id.diare -> {str = if (checked) "Gejala Diare Diseleksi" else "Gejala Diare Tidak Diseleksi"}
            R.id.BBMenurun -> {str = if (checked) "Gejala Berat Badan Menurun Diseleksi" else "Gejala Berat Badan Menurun Tidak Diseleksi"}
            R.id.BABhitam -> {str = if (checked) "Gejala BAB Berwarna Hitam Diseleksi" else "Gejala BAB Berwarna Hitam Tidak Diseleksi"}
            R.id.demam -> {str = if (checked) "Gejala Demam Diseleksi" else "Gejala Demam Tidak Diseleksi"}
            R.id.rasaMakanKembali -> {str = if (checked) "Gejala Rasa Makanan Kembali Diseleksi" else "Gejala Rasa Makanan Kembali Tidak Diseleksi"}
            R.id.babCair -> {str = if (checked) "Gejala BAB Cair Diseleksi" else "Gejala BAB Cair Tidak Diseleksi"}
            R.id.kejangPerut -> {str = if (checked) "Gejala Kejang Perut Diseleksi" else "Gejala Kejang Perut Tidak Diseleksi"}
            R.id.nyeriUluhHati -> {str = if (checked) "Gejala Nyeri Pada Uluh Hati Diseleksi" else "Gejala Nyeri Pada Uluh Hati Tidak Diseleksi"}
            R.id.kenyangBerlebih -> {str = if (checked) "Gejala Perasaan Kenyang Berlebihan Diseleksi" else "Gejala Perasaan Kenyang Berlebihan Tidak Diseleksi"}
            R.id.nyeriTukakLambung -> {str = if (checked) "Gejala Nyeri Pada Tukak Lambung Diseleksi" else "Gejala Nyeri Pada Tukak Lambung Tidak Diseleksi"}
            R.id.muntah -> {str = if (checked) "Gejala Muntah Diseleksi" else "Gejala Muntah Tidak Diseleksi"}
            R.id.rasaTerbakar -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}