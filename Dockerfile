FROM openjdk:20 AS builder
WORKDIR /out
COPY src/ src/
RUN javac src/ru/serjeypyzin/javacore/sample/*.java src/ru/serjeypyzin/javacore/regular/*.java


FROM openjdk:20
WORKDIR /out
COPY --from=builder /out/src /out/src
CMD ["java", "-cp", "src", "ru.serjeypyzin.javacore.sample.Main"]