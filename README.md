# Documentação da API Weather

Bem-vindo à documentação da API do Weather. Esta API oferece recursos para verificar a previção do tempo por meio de nomes de cidades ou código postal.

## Base URL

`localhost:8080/weather/`

## Autenticação

A API requer autenticação usando API key.

---

## Endpoints

### 1. Busca Previsão

#### `GET /{nameCity or zipCode}`

**Descrição:**
Busca a previsão do tempo de um determinado local por meio de uma string que pode ser um código postal ou o nome de uma cidade.

**Exemplo de Request:**
```bash
curl --location 'localhost:8080/weather/30140100'
```

**Exemplo de Response:**
```bash
{
    "weather": {
        "tempMax": "26.86",
        "tempMin": "25.44",
        "temp": "25.48"
    },
    "location": {
        "street": "Rua Cláudio Manoel",
        "district": "Funcionários",
        "state": "MG",
        "city": "Belo Horizonte",
        "country": "BR"
    }
}
```
## Erros Comuns

404 Not Found: The zip code of '{zip code}' was not found.

404 Not Found: .The city of '{name city}' was not found.

## Considerações Finais
Para mais informações sobre a API, entre em contato em jeffer.son_dasilva@live.com.

