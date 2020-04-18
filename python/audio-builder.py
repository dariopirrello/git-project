from  gtts import gTTS
import os

myTest = "Welcome, to my free course!"

language = 'it'

output = gTTS(text=myTest, lang = language, slow = False)

output.save("output1.opus")

os.system("start")


