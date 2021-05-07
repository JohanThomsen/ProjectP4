.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 0
aload 0
ldc "go NORTH to learn more"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 2
aload 2
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 1
LoopStart0:
aload 1
ldc "NORTH"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
i2f
ldc 0.0
fcmpl
ifeq truelabel1
iconst_0
goto endlabel1
truelabel1:
iconst_1
endlabel1:
ifeq BranchEnd0
aload 2
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 1
goto LoopStart0
BranchEnd0:
aload 0
ldc "Good job going North"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 3
.limit stack 10
return
.end method
