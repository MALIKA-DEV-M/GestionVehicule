#!/bin/bash
set -e

echo "=== Début des tests ==="

# Nettoyage et création des dossiers de sortie
rm -rf out
mkdir -p out

# Définition du chemin vers JUnit
JUNIT_JAR="/usr/share/java/junit-platform-console-standalone.jar"

# Compilation des fichiers Java principaux et des tests
echo "Compilation en cours..."
javac -cp "$JUNIT_JAR" -d out $(find src -name "*.java")

# Exécution des tests JUnit
echo "Lancement des tests unitaires..."
java -jar "$JUNIT_JAR" --class-path out --scan-classpath

echo "=== Tous les tests sont passés avec succès ! ==="

