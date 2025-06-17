// AI-Powered Assistant 
// A company is developing an AI-powered Virtual Assistant that can both speak and translate languages. 
//  Define an interface Speaker with a method speak(String text). 
//  Define another interface Translator with a method translate(String text, String language). 
//  Implement a class AIAssistant that inherits both interfaces and provides implementations for speech 
// synthesis and language translation. 
// Task: Implement the system and demonstrate how an AI Assistant can both speak and translate text.
interface Speaker {
    void speak(String text);
}

interface Translator {
    String translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {
    public void speak(String text) {
        System.out.println("Speaking: " + text);
    }

    public String translate(String text, String language) {
        // Basic demo translations
        switch (language.toLowerCase()) {
            case "spanish":
                return "Texto traducido en Español: Hola, ¿cómo puedo ayudarte hoy?";
            case "french":
                return "Texte traduit en Français: Bonjour, comment puis-je vous aider aujourd'hui?";
            case "english":
                return "Translated text in English: " + text;
            default:
                return "Translation not available for language: " + language;
        }
    }
}

public class AI_Assistant {
    public static void main(String[] args) {
        AIAssistant assistant = new AIAssistant();

        assistant.speak("Hello, how can I assist you today?");
        String translatedText = assistant.translate("Hello, how can I assist you today?", "French");
        System.out.println(translatedText);
    }
}
