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
                pantallaAlquiler();
                break;
            case 2:
                pantallaDevolver();
                break;
            case 3:
                pantallaMenuClientes();
                break;
            case 4:
                pantallaMenuMaquinas();
                break;
            case 5:
                pantallaListarMorosos();
                break;
        }
    }

    private void pantallaAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pantallaDevolver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pantallaMenuClientes() {
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
            if (opc != 0) {
                realizarOpcionGestionCliente(opc);
            }
        } while (opc != 0);
    }

    private void realizarOpcionGestionCliente(int opc) {
        System.out.println("Opción elegida: " + opc);

        switch (opc) {
            case 1:
                mostrarAltaCliente();
                break;
            case 2:
                mostrarBajaCliente();
                break;
            case 3:
                mostrarModificacionCliente();
                break;
            case 4:
                mostrarConsultaCliente();
                break;
        }
    }

    private void mostrarAltaCliente() {
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
