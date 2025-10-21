import EJ1.Titular;
import EJ1.Pasaporte;
import EJ1.Foto;

import EJ2.Usuario;
import EJ2.Bateria;
import EJ2.Celular;

import EJ3.Autor;
import EJ3.Editorial;
import EJ3.Libro;

import EJ4.Cliente;
import EJ4.Banco;
import EJ4.TarjetaDeCredito;

import EJ5.Propietario;
import EJ5.PlacaMadre;
import EJ5.Computadora;

import EJ6.Mesa;
import EJ6.Reserva;

import EJ7.Motor;
import EJ7.Conductor;
import EJ7.Vehiculo;

import EJ8.FirmaDigital;
import EJ8.Documento;

import EJ9.Paciente;
import EJ9.Profesional;
import EJ9.CitaMedica;

import EJ10.ClaveSeguridad;
import EJ10.CuentaBancaria;

import EJ11.Artista;
import EJ11.Cancion;
import EJ11.Reproductor;

import EJ12.Contribuyente;
import EJ12.Impuesto;
import EJ12.Calculadora;

import EJ13.CodigoQR;
import EJ13.GeneradorQR;

import EJ14.Proyecto;
import EJ14.Render;
import EJ14.EditorVideo;

public class TP5 {
    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRÁCTICO 5: RELACIONES UML ===\n");
        

        System.out.println("=== EJ 1: Pasaporte - Foto - Titular ===");
        EJ1.Titular t1 = new EJ1.Titular("Ana López", "12345678");
        Pasaporte p1 = new Pasaporte("A-2025", "2025-10-21", t1, "ana.jpg", "jpg");
        System.out.println("Pasaporte: " + p1);
        System.out.println("Titular: " + t1);
        System.out.println("Foto: " + p1.getFoto());
        System.out.println();
        

        System.out.println("=== EJ 2: Celular - Batería - Usuario ===");
        Bateria b2 = new Bateria("BT-5000", 5000);
        EJ2.Usuario u2 = new EJ2.Usuario("Luis Pérez", "87654321");
        Celular c2 = new Celular("123ABC", "Samsung", "A54", b2, u2);
        System.out.println("Celular: " + c2);
        System.out.println("Usuario: " + u2);
        System.out.println("Batería: " + b2);
        System.out.println();
        

        System.out.println("=== EJ 3: Libro - Autor - Editorial ===");
        Autor a3 = new Autor("Julio Cortázar", "Argentina");
        Editorial e3 = new Editorial("Alfaguara", "Buenos Aires");
        Libro l3 = new Libro("Rayuela", "123-456", a3, e3);
        System.out.println("Libro: " + l3);
        System.out.println("Autor: " + a3);
        System.out.println("Editorial: " + e3);
        System.out.println();
        
       
        System.out.println("=== EJ 4: TarjetaDeCrédito - Cliente - Banco ===");
        EJ4.Cliente c4 = new EJ4.Cliente("María Ruiz", "33333333");
        Banco b4 = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito t4 = new TarjetaDeCredito("1234-5678", "12/28", c4, b4);
        System.out.println("Tarjeta: " + t4);
        System.out.println("Cliente: " + c4);
        System.out.println("Banco: " + b4);
        System.out.println();
        
      
        System.out.println("=== EJ 5: Computadora - PlacaMadre - Propietario ===");
        Propietario p5 = new Propietario("Carlos Díaz", "22222222");
        Computadora c5 = new Computadora("ASUS", "ABC123", "B650M", "AMD", p5);
        System.out.println("Computadora: " + c5);
        System.out.println("Propietario: " + p5);
        System.out.println("Placa Madre: " + c5.getPlacaMadre());
        System.out.println();
        

        System.out.println("=== EJ 6: Reserva - Cliente - Mesa ===");
        EJ6.Cliente c6 = new EJ6.Cliente("Lucía Gómez", "123456789");
        Mesa m6 = new Mesa(4, 6);
        Reserva r6 = new Reserva("2025-10-21", "20:30", c6, m6);
        System.out.println("Reserva: " + r6);
        System.out.println("Cliente: " + c6);
        System.out.println("Mesa: " + m6);
        System.out.println();
        

        System.out.println("=== EJ 7: Vehículo - Motor - Conductor ===");
        Motor m7 = new Motor("V8", "MTR123");
        Conductor c7 = new Conductor("Roberto Silva", "Bl2345");
        Vehiculo v7 = new Vehiculo("AB123CD", "Camaro", m7, c7);
        System.out.println("Vehículo: " + v7);
        System.out.println("Conductor: " + c7);
        System.out.println("Motor: " + m7);
        System.out.println();
        

        System.out.println("=== EJ 8: Documento - FirmaDigital - Usuario ===");
        EJ8.Usuario u8 = new EJ8.Usuario("Laura Torres", "laura@mail.com");
        Documento d8 = new Documento("Contrato", "Contenido del contrato de servicios profesionales...", u8);
        System.out.println("Documento: " + d8);
        System.out.println("Usuario: " + u8);
        System.out.println("Firma Digital: " + d8.getFirma());
        System.out.println();
        

        System.out.println("=== EJ 9: CitaMédica - Paciente - Profesional ===");
        Paciente p9 = new Paciente("Niguel Ramos", "OSDE");
        Profesional dr9 = new Profesional("Dra. Pérez", "Cardiología");
        CitaMedica c9 = new CitaMedica("2025-10-22", "10:00", p9, dr9);
        System.out.println("Cita Médica: " + c9);
        System.out.println("Paciente: " + p9);
        System.out.println("Profesional: " + dr9);
        System.out.println();
        

        System.out.println("=== EJ 10: CuentaBancaria - ClaveSeguridad - Titular ===");
        EJ10.Titular t10 = new EJ10.Titular("Sofía López", "33444555");
        CuentaBancaria c10 = new CuentaBancaria("123000789", 50000, "ABC123", "2025-09-01", t10);
        System.out.println("Cuenta Bancaria: " + c10);
        System.out.println("Titular: " + t10);
        System.out.println("Clave Seguridad: " + c10.getClaveSeguridad());
        System.out.println();
        
        
        System.out.println("=== EJ 11: Reproductor - Canción - Artista ===");
        Artista a11 = new Artista("Mercedes Sosa", "Folklore");
        Cancion c11 = new Cancion("Alfonsina y el mar", a11);
        Reproductor r11 = new Reproductor();
        r11.reproducir(c11);
        System.out.println();
        
        
        System.out.println("=== EJ 12: Impuesto - Contribuyente - Calculadora ===");
        Contribuyente c12 = new Contribuyente("Juan Pérez", "20-12345678-9");
        Impuesto i12 = new Impuesto(10000, c12);
        Calculadora calc12 = new Calculadora();
        calc12.calcular(i12);
        System.out.println();
        
        
        System.out.println("=== EJ 13: GeneradorQR - CódigoQR - Usuario ===");
        EJ13.Usuario u13 = new EJ13.Usuario("Carla Fernández", "carla@mail.com");
        GeneradorQR g13 = new GeneradorQR();
        g13.generar("USR-2025-QR", u13);
        System.out.println();
        
        
        System.out.println("=== EJ 14: EditorVideo - Proyecto - Render ===");
        Proyecto p14 = new Proyecto("Documental Patagonia", 45);
        EditorVideo e14 = new EditorVideo();
        e14.exportar("MP4", p14);
        
        System.out.println("\n=== TODOS LOS EJS COMPLETADOS EXITOSAMENTE ===");
    }
}