# **Panadería Sweet Bread** 🥐
Este es un proyecto de práctica donde desarrollé una **interfaz gráfica de usuario (GUI)** con la implementación de **lógica de compras en tiempo real** utilizando Java y Swing.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/Apache_NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)

<img width="400" height="350" alt="image" src="https://github.com/user-attachments/assets/3cfeb7b1-fce0-4a25-a5ad-4586725fae00" />





## ¿Cómo funciona la aplicación?

La aplicación te permite navegar entre 3 categorías: **Panes, Postres y Bebidas**.

1. **Navegación por Catálogo:** El usuario puede alternar visualmente entre las vistas de Postres, Panes y Bebidas mediante el menú lateral.
2. **Cálculo de Precios Unitaros:** Al seleccionar un producto en el menú desplegable (`JComboBox`) e ingresar una cantidad, el sistema asigna el precio correspondiente usando estructuras de control (`switch`).
3. **Acumulación de Pedidos:** 
   * **Boton Calcular:** Muestra el subtotal del producto seleccionado multiplicando su precio unitario por la cantidad.
   * **Boton Agregar:** Añade el item a la orden global e integra la información en un desglose acumulativo.
   * **Boton Total compra:** Muestra un resumen general de la cuenta en pantalla (`JOptionPane`) con el detalle de items pedidos y el valor total a pagar.
   * **Boton Nueva Compra:** Limpia y reinicia las variables para procesar un nuevo pedido desde cero.

##  Características

* **Interfaz Intuitiva:** Componentes gráficos Swing (`JFrame`, `JPanel`, `JButton`, `JTextField`, `JComboBox`).
* **Apoyo Visual:** Integración de imágenes estáticas para hacer el menú más visual y amigable.
* **Eventos:** Manejo de clics e interacciones mediante `ActionListener`.
* **Feedback al Usuario:** Uso de cuadros de diálogo contextuales (`JOptionPane`) para mostrar resúmenes de cuenta y alertas de selección.
