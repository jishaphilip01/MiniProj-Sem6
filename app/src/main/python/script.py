import pickle
import pandas as pd
#gender,age,height,weight,duration,heartRate,bodyTemp
pickle.dump(model,open('model1.pkl', 'wb'))
model = pickle.load(open('model1.pkl','rb'))
def main():
    input_data = { 'Gender': 1, 'Age': 20, 'Height': 156, 'Weight' : 60, 'Duration' : 1000 , 'Heart_Rate' : 100, 'Body_Temp' : 36}
    input = pd.DataFrame([input_data])
    result = model.predict(input)
    print(result)