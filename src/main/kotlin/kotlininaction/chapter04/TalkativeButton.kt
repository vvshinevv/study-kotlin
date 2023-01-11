package kotlininaction.chapter04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("hey")
    protected fun whisper() = println("Let's talk")
    internal fun TalkativeButton.giveSpeech() {
        yell()
        whisper()
    }

}

