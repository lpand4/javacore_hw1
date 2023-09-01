FROM bellsoft/liberica-openjdk-alpine

COPY ./java ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/ru/gb/lesson1/sample/Main.java

CMD java -cp ./out ru.gb.lesson1.sample.Main