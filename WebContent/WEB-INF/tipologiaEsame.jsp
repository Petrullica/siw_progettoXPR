<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<title>TipologiaEsame</title>
</head>
<body>
<f:view>
<h1>${tipologiaEsameController.tipologiaEsame.nome}</h1>
<h2>Details</h2>
<div>Descrizione: ${tipologiaEsameController.tipologiaEsame.descrizione}</div>
<div>Costo: ${tipologiaEsameController.tipologiaEsame.prezzo}</div>
</f:view>
</body>
</html>