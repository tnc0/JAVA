import time
import os 
a = 1
b = 1
for i in range(150):
    
    a,b = b,a+b
    if((a**(1/2)).is_integer()):
        print(a**(1/2))


#Kayan yazı 
second = 1
bosluk = 1
string = "▬▬|▬"
while (True):
    os.system('cls' if os.name == 'nt' else 'clear')
    print(bosluk*" "+string,end="")
    time.sleep(0.5)
    bosluk +=2
    string = '▬' + string
    second+=1 
    if(second == 120): #60 saniye
        break
