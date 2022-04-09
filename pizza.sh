#/bin/bash

echo "Qual é a sua pizza favorita?"

echo "1 - Mussarela"
echo "2 - Calabresa"
echo "3 - Peperoni"
echo "4 - Frango / Catupiry"

read pizza

case $pizza in
  1) echo "Amor sem beijo é igual pizza sem queijo.";;
  2) echo "Pizza e Refri, melhores amigos para sempre.";;
  3) echo "Para ser feliz não tem dia. Para comer pizza também não.";;
  4) echo "Sem Pizza a vida não teria sentido.";;
  *) echo "Você gosta mesmo de pizza?"
esac
