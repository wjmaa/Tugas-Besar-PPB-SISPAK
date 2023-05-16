package com.example.tubesppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.example.tubesppb.databinding.ActivitySystemBinding

class SystemActivity : AppCompatActivity() {
    lateinit var binding: ActivitySystemBinding

    private lateinit var T01 : CheckBox
    private lateinit var T02 : CheckBox
    private lateinit var T03 : CheckBox
    private lateinit var T04 : CheckBox
    private lateinit var T05 : CheckBox
    private lateinit var T06 : CheckBox
    private lateinit var T07 : CheckBox
    private lateinit var T08 : CheckBox
    private lateinit var T09 : CheckBox
    private lateinit var T10 : CheckBox
    private lateinit var T11 : CheckBox
    private lateinit var T12 : CheckBox
    private lateinit var T13 : CheckBox
    private lateinit var T14 : CheckBox
    private lateinit var T15 : CheckBox
    private lateinit var T16 : CheckBox
    private lateinit var T17 : CheckBox
    private lateinit var T18 : CheckBox
    private lateinit var T19 : CheckBox
    private lateinit var T20 : CheckBox
    private lateinit var T21 : CheckBox
    private lateinit var T22 : CheckBox
    private lateinit var T23 : CheckBox
    private lateinit var T24 : CheckBox
    private lateinit var T25 : CheckBox
    private lateinit var T26 : CheckBox
    private lateinit var T27 : CheckBox
    private lateinit var T28 : CheckBox
    private lateinit var btnDiagnosa : Button
    private lateinit var resultDiagnosa : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySystemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        T01 = findViewById<CheckBox>(R.id.penglihatanTerasaKabur)
        T02 = findViewById<CheckBox>(R.id.mataBerair)
        T03 = findViewById<CheckBox>(R.id.mataBengkak)
        T04 = findViewById<CheckBox>(R.id.mataTerasaPerih)
        T05 = findViewById<CheckBox>(R.id.mataTerasaAdaYangMengganjal)
        T06 = findViewById<CheckBox>(R.id.penglihatanSilau)
        T07 = findViewById<CheckBox>(R.id.terlihatLingkaranCahaya)
        T08 = findViewById<CheckBox>(R.id.penglihatanObjekGanda)
        T09 = findViewById<CheckBox>(R.id.mataBerwarnaMerah)
        T10 = findViewById<CheckBox>(R.id.mataTerasaGatal)
        T11 = findViewById<CheckBox>(R.id.mataTerasaPanas)
        T12 = findViewById<CheckBox>(R.id.sakitKepala)
        T13 = findViewById<CheckBox>(R.id.mataTerasaSakit)
        T14 = findViewById<CheckBox>(R.id.mataMeradang)
        T15 = findViewById<CheckBox>(R.id.mataNyeriHebat)
        T16 = findViewById<CheckBox>(R.id.mataTerasaNyeri)
        T17 = findViewById<CheckBox>(R.id.kelainanPadaPupilMata)
        T18 = findViewById<CheckBox>(R.id.mataLelah)
        T19 = findViewById<CheckBox>(R.id.seringMengedipkanMata)
        T20 = findViewById<CheckBox>(R.id.pekaTerhadapCahaya)
        T21 = findViewById<CheckBox>(R.id.penglihatanDekatTerasaKabur)
        T22 = findViewById<CheckBox>(R.id.tekananBolaMataMeningkat)
        T23 = findViewById<CheckBox>(R.id.penglihatanObjekJauhKurangTerlihatJelas)
        T24 = findViewById<CheckBox>(R.id.lemakMenutupiKornea)
        T25 = findViewById<CheckBox>(R.id.menyipitkanMataUntukMelihatBendaYangDekat)
        T26 = findViewById<CheckBox>(R.id.sumberCahayaAkanBerwarnaPelangiJikaMelihatCahayaYangTerang)
        T27 = findViewById<CheckBox>(R.id.mataTegang)
        T28 = findViewById<CheckBox>(R.id.terlihatBayanganGarisHitam)

        btnDiagnosa = findViewById<Button>(R.id.btnDiagnosa)
        resultDiagnosa = findViewById<TextView>(R.id.resultDiagnosa)

        btnDiagnosa.setOnClickListener{
            var namaPenyakit = ""

            // Memeriksa status checkbox dan menggabungkan nama penyakit yang sesuai dengan rule
            if (T01.isChecked && T08.isChecked
                && T16.isChecked && T28.isChecked) {
                namaPenyakit += "Katarak"
            }
            if (T05.isChecked && T20.isChecked) {
                namaPenyakit += "DryEye(MataKering)"
            }
            if (T13.isChecked && T17.isChecked
                && T22.isChecked && T26.isChecked) {
                namaPenyakit += "Glaukoma"
            }
            if (T02.isChecked && T03.isChecked
                && T10.isChecked && T11.isChecked
                && T16.isChecked) {
                namaPenyakit += "Keratitis"
            }
            if (T12.isChecked && T18.isChecked
                && T19.isChecked && T23.isChecked) {
                namaPenyakit += "Myopia"
            }
            if (T02.isChecked && T09.isChecked
                && T24.isChecked) {
                namaPenyakit += "Pterygium"
            }
            if (T12.isChecked && T21.isChecked
                && T25.isChecked ) {
                namaPenyakit += "Hypermetropi"
            }
            if (T01.isChecked && T27.isChecked) {
                namaPenyakit += "Astigmatisma"
            }
            else{
                namaPenyakit += "Penyakit yang tidak terdeteksi"
            }

            // Menampilkan hasil diagnosis di TextView resultDiagnosa
            resultDiagnosa.text = "Anda didiagnosis dengan: $namaPenyakit"

        }
    }

    fun onClickChecked(view: View?){
        val checked = (view as CheckBox).isChecked
        var str = ""
        when (view.id) {
            R.id.penglihatanTerasaKabur -> {str = if (checked) "Gejala Nyeri atau Perih Pada Lambung Diseleksi" else "Gejala Nyeri atau Perih Pada Lambung Tidak Diseleksi"}
            R.id.mataBerair -> {str = if (checked) "Gejala Perut Kembung Diseleksi" else "Gejala Perut Kembung Tidak Diseleksi"}
            R.id.mataBengkak -> {str = if (checked) "Gejala Nafsu Makan Berkurang Diseleksi" else "Gejala Nafsu Makan Berkurang Tidak Diseleksi"}
            R.id.mataTerasaPerih -> {str = if (checked) "Gejala Mual Diseleksi" else "Gejala Mual Tidak Diseleksi"}
            R.id.mataTerasaAdaYangMengganjal -> {str = if (checked) "Gejala Sembelit Diseleksi" else "Gejala Sembelit Tidak Diseleksi"}
            R.id.penglihatanSilau -> {str = if (checked) "Gejala Diare Diseleksi" else "Gejala Diare Tidak Diseleksi"}
            R.id.terlihatLingkaranCahaya -> {str = if (checked) "Gejala Berat Badan Menurun Diseleksi" else "Gejala Berat Badan Menurun Tidak Diseleksi"}
            R.id.penglihatanObjekGanda -> {str = if (checked) "Gejala BAB Berwarna Hitam Diseleksi" else "Gejala BAB Berwarna Hitam Tidak Diseleksi"}
            R.id.mataBerwarnaMerah -> {str = if (checked) "Gejala Demam Diseleksi" else "Gejala Demam Tidak Diseleksi"}
            R.id.mataTerasaGatal -> {str = if (checked) "Gejala Rasa Makanan Kembali Diseleksi" else "Gejala Rasa Makanan Kembali Tidak Diseleksi"}
            R.id.mataTerasaPanas -> {str = if (checked) "Gejala BAB Cair Diseleksi" else "Gejala BAB Cair Tidak Diseleksi"}
            R.id.sakitKepala -> {str = if (checked) "Gejala Kejang Perut Diseleksi" else "Gejala Kejang Perut Tidak Diseleksi"}
            R.id.mataTerasaSakit -> {str = if (checked) "Gejala Nyeri Pada Uluh Hati Diseleksi" else "Gejala Nyeri Pada Uluh Hati Tidak Diseleksi"}
            R.id.mataMeradang -> {str = if (checked) "Gejala Perasaan Kenyang Berlebihan Diseleksi" else "Gejala Perasaan Kenyang Berlebihan Tidak Diseleksi"}
            R.id.mataNyeriHebat -> {str = if (checked) "Gejala Nyeri Pada Tukak Lambung Diseleksi" else "Gejala Nyeri Pada Tukak Lambung Tidak Diseleksi"}
            R.id.mataTerasaNyeri -> {str = if (checked) "Gejala Muntah Diseleksi" else "Gejala Muntah Tidak Diseleksi"}
            R.id.kelainanPadaPupilMata -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.mataLelah -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.seringMengedipkanMata -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.pekaTerhadapCahaya -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.penglihatanDekatTerasaKabur -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.tekananBolaMataMeningkat -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.penglihatanObjekJauhKurangTerlihatJelas -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.lemakMenutupiKornea -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.menyipitkanMataUntukMelihatBendaYangDekat -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.sumberCahayaAkanBerwarnaPelangiJikaMelihatCahayaYangTerang -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.mataTegang -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}
            R.id.terlihatBayanganGarisHitam -> {str = if (checked) "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" else "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi"}

        }
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}