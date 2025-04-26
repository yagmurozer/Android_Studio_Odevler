package com.example.odevler.Odev2

fun celciusToFahrenheit(celcius:Double) : Double {
    return celcius * 1.8 + 32
}

fun dikdortgenCevresi(uzunluk : Double, genislik : Double ) : Double{
    return (uzunluk + genislik) * 2
}

fun faktoriyelHesaplama(sayi : Int) : Long{
    if (sayi < 0)
        return -1
    if (sayi<= 1)
        return 1
    var sonuc : Long = 1
    for (i in 2..sayi){
        sonuc *= i
    }

    return sonuc
}
fun aHarfiSayisi(kelime: String): Int {
    return  kelime.count {it == 'a' || it =='A'}
//it burada string içindeki her bir karakteri temsil eder
}

fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gun : Int) : Double{
    val gunlukCalismaSaati = 8
    val toplamCalismaSaati = gun * gunlukCalismaSaati
    val saatUcreti= 10
    val mesaiSaatUcreti = 20
    val mesaiSiniri = 160
    val sonuc : Double
    if (toplamCalismaSaati <= mesaiSiniri){
        sonuc = (toplamCalismaSaati * saatUcreti).toDouble()
    }
    else {
        sonuc =(mesaiSiniri * saatUcreti) + ((toplamCalismaSaati - mesaiSiniri) * mesaiSaatUcreti).toDouble()
    }
    return sonuc


}

fun kotaUcretiHesapla(kota : Int) : Double{
    val temelKota = 50
    val temelUcret = 100.0
    val ekstraGBUcreti = 4.0

    return if (kota <= temelKota) {
        temelUcret
    } else {
        temelUcret + ((kota - temelKota) * ekstraGBUcreti)
    }
}

fun main(){

    val celcius = 25.0
    println("${celcius}C = ${celciusToFahrenheit(celcius)} F")


    val uzunluk = 5.0
    val genislik = 3.0
    println("Dikdortgen cevresi ${dikdortgenCevresi(uzunluk, genislik)}")


    val sayi = 5
    println("$sayi! = ${faktoriyelHesaplama(sayi)}")


    val kelime = "Ankara"
    println("$kelime' kelimesinde ${aHarfiSayisi(kelime)} tane a harfi vardir.")


    val kenarSayisi = 5
    println("$kenarSayisi kenarli seklin ic acilarinin toplami: ${icAcilarToplami(kenarSayisi)} derecedir")


    val gun = 22
    println("$gun gunluk maas: ${maasHesapla(gun)} TL")


    val kota = 75
    println("$kota GB kota ucreti: ${kotaUcretiHesapla(kota)} TL")

}