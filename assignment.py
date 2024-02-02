import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns

def load_dataset():
    df = pd.read_csv("C:\\Users\\chopr\\Desktop\\Machine Learning\\Bias_correction_ucl.csv")
    return df

def data_exploration(df):
    print("Dimensions:", df.ndim)
    print("Shape:", df.shape)
    print("Size:", df.size)
    print("Attributes Types:\n", df.dtypes)
    print("First few rows:\n", df.head())
    print("Summary Statistics:\n", df.describe())
    df = df.dropna()
    df = df[(df['Present_Tmax'] > 0) & (df['Present_Tmin'] > 0)]

def temporal_analysis(df):
    df['Date'] = pd.to_datetime(df['Date'])
    df['Year'] = df['Date'].dt.year
    plt.figure(figsize=(12, 6))
    sns.boxplot(x='Year', y='Present_Tmax', data=df)
    sns.boxplot(x='Year', y='Present_Tmin', data=df)
    plt.title('Temperature Variation Over Different Years')
    plt.xlabel('Year')
    plt.ylabel('Temperature (°C)')
    plt.show()

def geographical_analysis(df):
    plt.figure(figsize=(12, 6))
    sns.scatterplot(x='DEM', y='Present_Tmax', data=df, label='Present_Tmax')
    sns.scatterplot(x='DEM', y='Present_Tmin', data=df, label='Present_Tmin')
    plt.title('Impact of Elevation on Temperature')
    plt.xlabel('Elevation (m)')
    plt.ylabel('Temperature (°C)')
    plt.legend()
    plt.show()
    plt.figure(figsize=(12, 6))
    sns.scatterplot(x='Slope', y='Present_Tmax', data=df, label='Present_Tmax')
    sns.scatterplot(x='Slope', y='Present_Tmin', data=df, label='Present_Tmin')
    plt.title('Impact of Slope on Temperature')
    plt.xlabel('Slope (°)')
    plt.ylabel('Temperature (°C)')
    plt.legend()
    plt.show()

def correlation_analysis(df):
    correlation_matrix = df.corr()
    plt.figure(figsize=(14, 10))
    sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', fmt=".2f")
    plt.title('Correlation Matrix for Numerical Features')
    plt.show()

    highly_correlated = df.corr().abs() > 0.8
    print("Highly Correlated Features:\n", highly_correlated)

def feature_specific_analysis(df):
    plt.figure(figsize=(12, 6))
    sns.scatterplot(x='LDAPS_CC1', y='Present_Tmax', data=df, label='Present_Tmax')
    sns.scatterplot(x='LDAPS_CC1', y='Present_Tmin', data=df, label='Present_Tmin')
    plt.title('Impact of Cloud Cover on Temperature')
    plt.xlabel('LDAPS_CC1 (Cloud Cover)')
    plt.ylabel('Temperature (°C)')
    plt.legend()
    plt.show()
    plt.figure(figsize=(12, 6))
    sns.scatterplot(x='LDAPS_PPT1', y='Present_Tmax', data=df, label='Present_Tmax')
    sns.scatterplot(x='LDAPS_PPT1', y='Present_Tmin', data=df, label='Present_Tmin')
    plt.title('Impact of Precipitation on Temperature')
    plt.xlabel('LDAPS_PPT1 (Precipitation)')
    plt.ylabel('Temperature (°C)')
    plt.legend()
    plt.show()

    boxplot_attributes = df.columns.difference(['Date'])
    plt.figure(figsize=(18, 12))
    sns.boxplot(data=df[boxplot_attributes])
    plt.title('Box Plot for All Attributes')
    plt.xticks(rotation=45)
    plt.show()

def main():
    df = None
    while True:
        print("\nMenu:")
        print("1. Load the Dataset")
        print("2. Data Exploration")
        print("3. Temporal Analysis")
        print("4. Geographical Analysis")
        print("5. Correlation Analysis")
        print("6. Feature-specific Analysis")
        print("7. Exit\n")

        choice = input("Enter your choice (1-7): ")

        if choice == '1':
            df = load_dataset()
        elif choice == '2':
            if df is not None:
                data_exploration(df)
            else:
                print("Please load the dataset first.")
        elif choice == '3':
            if df is not None:
                temporal_analysis(df)
            else:
                print("Please load the dataset first.")
        elif choice == '4':
            if df is not None:
                geographical_analysis(df)
            else:
                print("Please load the dataset first.")
        elif choice == '5':
            if df is not None:
                correlation_analysis(df)
            else:
                print("Please load the dataset first.")
        elif choice == '6':
            if df is not None:
                feature_specific_analysis(df)
            else:
                print("Please load the dataset first.")
        elif choice == '7':
            print("Exiting the program.")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 7.")


main()