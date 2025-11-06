package vista;

import java.util.Scanner;

public class Pantalla {

    public void mostrarOpciones() {
        Scanner s = new Scanner(System.in);
        int opc = -1;
        do {
            System.out.println("\n\n\n\tMenú Principal:\n");
            System.out.println("\t1. Alquilar");
            System.out.println("\t2. Devolver");
            System.out.println("\t3. Gestionar clientes");
            System.out.println("\t4. Gestionar maquinas");
            System.out.println("\t5. Listar morosos");
            System.out.println("\t----------------------");
            System.out.println("\t\t0. Salir");
            System.out.println("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 5) {
                System.out.println("\n\n--> Introduzca una opción válida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcion(opc);
            }
        } while (opc != 0);
    }

    private void realizarOpcion(int opc) {
        switch (opc) {
            case 1:
                pantallaComprarEntradas();
                break;
            case 2:
                pantallaConsultaAnimales();
                break;
            case 3:
                pantallaAnadirAnimal();
                break;
            case 4:
                pantallaModificarHorario();
                break;
            case 5:
                pantallaGenerarReporte();
                break;
        }
    }

    private void pantallaComprarEntradas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pantallaConsultaAnimales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pantallaAnadirAnimal() {
        Scanner s = new Scanner(System.in);
        int opc = -1;

        do {
            System.out.println("\n\n\n\tMenú Gestión Cliente:\n");
            System.out.println("\t1. Alta de Cliente");
            System.out.println("\t2. Baja de Cliente");
            System.out.println("\t3. Modificación de Cliente");
            System.out.println("\t4. Consulta de Cliente");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 4) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
           
        } while (opc != 0);
    }

    private void pantallaModificarHorario() {
        System.out.println("Opción elegida: ");

       
    }

    private void pantallaGenerarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarBajaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarModificacionCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mostrarConsultaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    private void pantallaMenuMaquinas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    private void pantallaListarMorosos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
