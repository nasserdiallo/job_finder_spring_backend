package com.genuinecoder.springserver.model.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
public class CV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String email;
    private String telephone;
    private String specialite;
    private String niveauEtude;
    private String experiencePro;

    public CV() {
    }

    public CV(int id, String nom, String prenom, int age, String adresse, String email, String telephone, String specialite, String niveauEtude, String experiencePro) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
        this.niveauEtude = niveauEtude;
        this.experiencePro = experiencePro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(String niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    public String getExperiencePro() {
        return experiencePro;
    }

    public void setExperiencePro(String experiencePro) {
        this.experiencePro = experiencePro;
    }



    @Override
    public String toString() {
        return "CV{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", prenom='" + prenom + '\'' +
            ", age=" + age +
            ", adresse='" + adresse + '\'' +
            ", email='" + email + '\'' +
            ", telephone='" + telephone + '\'' +
            ", specialite='" + specialite + '\'' +
            ", niveauEtude='" + niveauEtude + '\'' +
            ", experiencePro='" + experiencePro + '\'' +
            '}';
    }

}
