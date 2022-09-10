package projects.designPatterns;

public class Strategy {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.work(new HandJob());
        worker.work(new MindJob());
    }
}

class Worker {
    void work(IJob job){
        job.work();
    }
}

interface IJob {
    void work();
}

class HandJob implements IJob {
    @Override
    public void work() {
        System.out.println("hand job");
    }
}

class MindJob implements IJob {
    @Override
    public void work() {
        System.out.println("mind job");
    }
}
