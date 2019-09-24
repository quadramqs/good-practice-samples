package mobi.quadram.qsamples.api

class FakeRepositoryImpl: Repository {
    override fun setData(str: String) {

    }

    override fun getData(): String {
        return "FAKE"
    }

}