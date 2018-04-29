package com.workshop.aplikasiportalberita.network;

import com.workshop.aplikasiportalberita.Model.ModelBerita;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita.php")
    Call<ModelBerita> request_show_all_berita();
    // <ModelData> nama_method()

}
