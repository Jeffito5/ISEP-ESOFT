@startuml

skinparam classAttributeIconSize 0
hide methods
left to right direction

class Plataforma {
  -String designacao
}
class Organizacao{
  -String nome
  -String NIF
  -String website
  -String telefone
  -String email
  }

class ProcessoAtribuicao {
  -String emailOrganizacao
  -String freelancer
  -String descTarefa
  -Integer periodoTempo
  -Integer valor
  -String anuncioOriginal
  -Integer numSeq
  -Date dtInicioAdjudicacao
  }

class TipoRegimento
{
    -String designacao
    -String descricaoRegras
}

class Adjudicacao {
  -Date dataRealizacao
  }

class AtribuicaoObrigatoria {
  }

class SeriacaoObjetiva {
  }
  
class Anuncio
{
    -Date dtInicioPublicitacao
    -Date dtFimPublicitacao
    -Date dtInicioCandidatura
    -Date dtFimCandidatura
    -Date dtInicioSeriacao
    -Date dtFimSeriacao
}

class Candidatura
{
    -Date dataCandidatura
    -Double valorPretendido
    -Integer nrDias
    -String txtApresentacao
    -String txtMotivacao
}

class Classificacao
{
    -Integer lugar
    -String justificacao
}

class ProcessoSeriacao
{
    -Date dataRealizacao
    -String conclusao
}
class Freelancer{
  -String nome
  -String NIF
  -String telefone
  -String email 
  }
class Tarefa{
  -String referencia
  -String designacao
  -String descInf
  -String descTecnica
  -Integer duracaoEst
  -Double custoEst
  }
class Colaborador{
  -String nome
  -String funcao
  -String telefone
  -String email
  }

Plataforma "1" -- "*" Anuncio : publicita >
Plataforma "1" -- "*" AtribuicaoObrigatoria: realiza >
Plataforma "1" -- "*" SeriacaoObjetiva: realiza >
Plataforma "1" -- "*" Organizacao: tem registadas >
Plataforma "1" -- "*" Freelancer: tem/usa >
Plataforma "1" -- "1" Candidatura: recebe >

Organizacao "1" -- "*" Tarefa: possui >
Organizacao "1" -- "*" Colaborador: tem >

Tarefa "1" -- "0..1" Anuncio: dá origem >
Tarefa "*" -- "1" Colaborador: especificada por >

ProcessoAtribuicao "1" -- "1" TipoRegimento: decorre em concordância com >
ProcessoAtribuicao "1" -- "1" Classificacao: resulta >
ProcessoAtribuicao "1" -- "1" Adjudicacao: > espoleta

AtribuicaoObrigatoria "1" -- "1" ProcessoAtribuicao: prevê >

SeriacaoObjetiva "1" -- "1" ProcessoSeriacao: prevê >

Anuncio "*" -- "1" TipoRegimento: rege-se por >
Anuncio "*" -- "1" ProcessoAtribuicao: espoleta >
Anuncio "1" -- "1" Adjudicacao: recebe >
Anuncio "1" -- "0..1" ProcessoSeriacao: espoleta >
Anuncio "1" -- "0..1" Tarefa: publicita >
Anuncio "1" -- "*" Candidatura: recebe >
Anuncio "*" -- "1" Colaborador: publicado por >

ProcessoSeriacao "1" -- "1" TipoRegimento: decorre em concordância com >
ProcessoSeriacao "1" -- "1" ProcessoAtribuicao: espoleta >

Classificacao "1" -- "1" Candidatura: referente a >

Candidatura "*" -- "1" Freelancer: realizada por >

Adjudicacao "1" -- "*" Colaborador: realizada por > 
Adjudicacao "1" -- "1" Freelancer: referente a >
Adjudicacao "1" -- "1" Classificacao: recebe >

@enduml