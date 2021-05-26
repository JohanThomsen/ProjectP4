.class public Out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 5
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 6
ldc "alive"
astore 8
ldc 1.0
fstore 7
ldc ""
astore 10
aload 5
ldc "Who are you"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 6
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 9
aload 5
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "You wake in a dusty tavern room"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "There is blood on the walls and dust on the floors"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "You see footsteps leading from the door to your window"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 9
invokestatic Out/CheckSanity(Ljava/lang/String;)V
aload 5
ldc "What do you check"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fconst_0
fstore_0
LoopStart0:
fload 7
ldc 1.0
fcmpl
ifeq truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
i2f
f2i
ifeq BranchEnd0
fconst_1
fload_0
fadd
fstore_0
aload 6
invokevirtual java/util/Scanner.nextLine()Ljava/lang/String;
astore 10
aload 10
ldc "blood"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel1
iconst_0
goto endlabel1
truelabel1:
iconst_1
endlabel1:
i2f
f2i
ifeq BranchEnd1
aload 9
invokestatic Out/HandleBlood(Ljava/lang/String;)V
ldc "dead"
astore 8
goto BranchEnd0
BranchEnd1:
aload 10
ldc "footsteps"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel2
iconst_0
goto endlabel2
truelabel2:
iconst_1
endlabel2:
i2f
f2i
ifeq BranchEnd2
aload 5
ldc "The footsteps are of a demon"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "You hear a snarl and look up you see the eldritch horror and it kills you"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc "dead"
astore 8
goto BranchEnd0
BranchEnd2:
aload 10
ldc "door"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel3
iconst_0
goto endlabel3
truelabel3:
iconst_1
endlabel3:
i2f
f2i
ifeq BranchEnd3
aload 5
ldc "You check the door and its open you leave"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto BranchEnd0
BranchEnd3:
aload 10
ldc "window"
invokevirtual java/lang/String.compareTo(Ljava/lang/String;)I
i2f
fconst_0
fcmpl
ifeq truelabel4
iconst_0
goto endlabel4
truelabel4:
iconst_1
endlabel4:
i2f
f2i
ifeq BranchEnd4
aload 5
ldc "You check the window it creeks as you open it you hear a voice behind you"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
ldc "Nyrlathep makes you become dead"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc "dead"
astore 8
goto BranchEnd0
BranchEnd4:
aload 5
ldc "Try again"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto LoopStart0
BranchEnd0:
aload 5
ldc "You are"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 5
aload 8
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 10000
.limit stack 10
return
.end method


.method public static HandleBlood(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 2
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 3
aload 2
ldc "The blood comes to life"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
ldc "It murders you"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
aload 0
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
ldc "rip"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 10000
.limit stack 10
return
.end method


.method public static CheckSanity(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 2
new java/util/Scanner
dup
getstatic java/lang/System.in Ljava/io/InputStream;
invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V
astore 3
aload 2
aload 0
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
ldc "To ensure your sanity please say the number 42"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 10.0
fstore 5
ldc 0.0
fstore 4
ldc 0.0
fstore_0
fconst_0
fstore_0
LoopStart1:
fload 5
ldc 42.0
fcmpl
iflt truelabel5
iconst_0
goto endlabel5
truelabel5:
iconst_1
endlabel5:
i2f
f2i
ifeq BranchEnd5
fconst_1
fload_0
fadd
fstore_0
aload 3
invokevirtual java/util/Scanner.nextFloat()F
fstore 5
fload 5
ldc 42.0
fcmpl
ifeq truelabel6
iconst_0
goto endlabel6
truelabel6:
iconst_1
endlabel6:
i2f
f2i
ifeq BranchEnd6
aload 2
ldc "correct"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd6:
fload 5
ldc 42.0
fcmpl
iflt truelabel7
iconst_0
goto endlabel7
truelabel7:
iconst_1
endlabel7:
i2f
f2i
ifeq BranchEnd7
aload 2
ldc "not quite right try again"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
BranchEnd7:
goto LoopStart1
BranchEnd5:
fload_0
fstore 4
aload 2
ldc "You are fine it only took you"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
fload 4
invokevirtual java/io/PrintStream/println(F)V
aload 2
ldc "tries"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 10000
.limit stack 10
return
.end method
