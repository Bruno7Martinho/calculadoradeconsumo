# Calculadora de Potência e Consumo de Eletrônicos

**Descrição:**  
A **Calculadora de Consumo** é um aplicativo Android que permite calcular o consumo de energia e o custo associado ao uso de aparelhos eletrônicos, como lâmpadas, ventiladores, televisores e outros dispositivos. O aplicativo recebe informações sobre a potência do aparelho, tempo de uso e o preço da energia, e calcula o consumo de energia (em kWh) e o custo total da energia consumida (em R$).

---

## Funcionalidades

1. **Entrada de Dados:**
   - O usuário informa os seguintes dados:
     - Potência do aparelho (em watts)
     - Tempo de uso (em horas)
     - Preço da energia por kWh (em R$)

2. **Cálculo do Consumo de Energia (CE):**
   - O aplicativo calcula o consumo de energia em quilowatts-hora (kWh) usando a fórmula:
     - **CE = (P * H) / 1000**
     - Onde:
       - **P** = Potência do aparelho (em watts)
       - **H** = Tempo de uso (em horas)

3. **Cálculo do Custo de Energia (C):**
   - O aplicativo calcula o custo associado ao consumo de energia, usando a fórmula:
     - **C = CE * PKWH**
     - Onde:
       - **PKWH** = Preço de energia por kWh (em R$)

4. **Exibição dos Resultados:**
   - O aplicativo exibe:
     - O consumo de energia (em kWh)
     - O custo total do uso do aparelho (em R$)

---

## Exemplo de Cálculo

### Consumo de energia:

- **Potência** da lâmpada: 60 W
- **Tempo de uso**: 5 horas
- **Consumo de energia (CE)**:
  - **CE = (60 * 5) / 1000 = 0,3 kWh**

### Custo de energia:

- **Preço da energia (PKWH)**: R$ 0,50/kWh
- **Custo (C)**:
  - **C = 0,3 * 0,50 = R$ 0,15**

Ou seja, o custo de usar uma lâmpada de 60W por 5 horas, com o preço da energia de R$ 0,50/kWh, seria **R$ 0,15**.

---

## Tecnologias Utilizadas

- **Android Studio**
- **Java**


---

## Como Usar

1. Clone ou faça o **download** deste repositório:
   ```bash
   git clone https://github.com/Bruno7Martinho/calculadoradeconsumo.git
