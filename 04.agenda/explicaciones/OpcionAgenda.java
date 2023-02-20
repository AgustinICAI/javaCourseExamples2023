enum OpcionAgenda{
  OTRA_OPCION("OTRA OPCION"),
  ANADIR_PERSONA("1. Añadir persona"),
  BORRAR_PERSONA("2. Borrar persona"),
  SALIR("3. Salir");
  
  
  String descripcion;
  
  OpcionAgenda(String descripcion){
    this.descripcion = descripcion;
  }
  
  String getDescripcion(){
    return descripcion;
  }
  

}
