## - Descripción

Implementar el patrón de diseño Decorator para la gestión de bebidas y complementos.

## - Patrón de Diseño Utilizado

### Decorator
Este patron nos permite agregar responsabilidades a un objeto sin modificar su estructura.

### Componentes

- Bebida
- Expreso
- Batido
- Descafeinado
- TostadoNegro

### Decoradores

- DecoratorComplemento
- Leche
- Moca
- Soya
- Crema

## - Estructura que se utilizó

```
Bebida
├──Expreso
├──Batido
├──Descafeinado
└──TostadoNegro

DecoratorComplemento
├──Leche
├──Moca
├──Soya
└──Crema