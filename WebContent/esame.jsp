<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Esame</title>
</head>
<body>
<f:view>
<h1>${esameController.esame.codice}</h1>
<h2>Details</h2>
<div>Data Prenotazione: ${esameController.esame.dataPrenotazioneEsame}</div>
<div>Data Svolgimento : ${esameController.esame.dataSvolgimentoEsame}</div>
<div>Tipologia Esame : ${esameController.tipologiaEsame.nome}</div>
<div>Medico : ${esameController.medico.nome}</div>
<div>Paziente : ${esameController.paziente.nome}</div>
</f:view>
</body>
</html>