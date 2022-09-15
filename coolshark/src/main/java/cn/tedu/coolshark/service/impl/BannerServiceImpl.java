package cn.tedu.coolshark.service.impl;

import cn.tedu.coolshark.mapper.BannerMapper;
import cn.tedu.coolshark.model.Banner;
import cn.tedu.coolshark.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 11:08
 */
@Service
public class BannerServiceImpl implements IBannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> findAll() {
        return bannerMapper.findAll();
    }

    @Override
    public void deleteById(int id) {
        bannerMapper.deleteById(id);
    }
}
