void main() {
    Bebida bebida = new Expreso();

    bebida.setTamano(Bebida.Tamano.MEDIANO);

    bebida = new Soya(bebida);
    bebida = new Crema(bebida);

    System.out.println(bebida.getDescripcion());
    System.out.println("Total: " + bebida.costo());

}