n1 = int(input('Informe o primeiro número:'))
print("-> Soma : +")
print("-> subtração: -")
print("-> Multiplicação: *")
print("-> divisão: /")
operacao = input('Informe a operação:')
n2 = int(input('Informe o segundo número:'))
resultado = 0

if operacao == '+':
    resultado = n1 + n2
elif operacao == '-':
    resultado = n1 - n2
elif operacao == '*':
    resultado = n1 * n2
elif operacao == '/':
    resultado = n1 / n2
else:
    resultado = 'Operação inválida'

print(n1,operacao,n2,'=',resultado)