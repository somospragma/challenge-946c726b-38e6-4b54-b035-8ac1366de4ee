# Aplicación de principios de código limpio en un microservicio

En el contexto de un proyecto de microservicios para una plataforma de préstamos en línea, es crucial mantener un código limpio y mantenible. El sistema debe incorporar principios SOLID, KISS, YAGNI y DRY para garantizar la calidad y escalabilidad del código. El objetivo es mejorar la estructura y legibilidad del código existente, reduciendo la complejidad y facilitando futuras modificaciones.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Código limpio |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Análisis del código existente

**Objetivo:** Identificar áreas de mejora en el código actual del microservicio.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Revisa el código del microservicio y localiza secciones que violen los principios SOLID, KISS, YAGNI y DRY.

**Entregable:** Lista de áreas de mejora identificadas en el código.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que SOLID se refiere a Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation y Dependency Inversion.
- KISS implica mantener el código simple y evitar complejidad innecesaria.
- YAGNI significa que no debes añadir funcionalidad hasta que sea realmente necesaria.
- DRY se refiere a no repetirte; si tienes código duplicado, refactorízalo.

</details>

### Fase 2: Refactorización del código

**Objetivo:** Aplicar los principios SOLID, KISS, YAGNI y DRY para mejorar el código del microservicio.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Refactoriza el código para que cumpla con los principios mencionados. Asegúrate de que cada clase tenga una única responsabilidad, que las interfaces sean pequeñas y específicas, y que el código no contenga funcionalidad innecesaria.

**Entregable:** Código refactorizado que aplica los principios SOLID, KISS, YAGNI y DRY.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza técnicas de refactorización como extracción de métodos, introducción de interfaces y reemplazo de condicionales complejos por polimorfismo.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué significa el principio SOLID y cómo se aplica en el contexto de este reto?
- **erroresComunes**: ¿Qué errores comunes se identificaron en el código existente y cómo se corrigieron?
- **comoSeUsa**: ¿Cómo se aplicaron los principios KISS y DRY en la refactorización del código?
- **queDecisionesImplica**: ¿Qué decisiones tomaste para asegurar que el código cumpla con los principios SOLID y YAGNI?

## Criterios de Evaluacion

- Identificar áreas de mejora en el código existente.
- Refactorizar el código para aplicar los principios SOLID, KISS, YAGNI y DRY.
- Documentar las decisiones tomadas durante la refactorización.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
