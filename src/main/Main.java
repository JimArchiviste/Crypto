package main;

import java.io.File;

import md5.Resume;
import md5.ResumeChaine;

public class Main {
	
	 public static void main(String[] args)
	 {
		 Resume resume = new Resume("/home/d12007301/Téléchargements/HMAC/email1.txt");
		 System.out.println(resume.getFileMd5());
		 //ResumeChaine resumechaine = new ResumeChaine("Alain Turin");
		 //System.out.println(resumechaine.getMessageMd5());
	 }

}
